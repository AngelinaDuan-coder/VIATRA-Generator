package hu.bme.mit.inf.dslreasoner.domains.cps.cplex;

import hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage;
import hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem;
import hu.bme.mit.inf.dslreasoner.domains.cps.cplex.CpsToLpTranslator;
import hu.bme.mit.inf.dslreasoner.domains.cps.generator.CpsGenerator;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class CbcCpsMain {
  private static final String PROBLEM_FILE = "problem.lp";
  
  private static final String SOLUTION_FILE = "solution.txt";
  
  private CbcCpsMain() {
    new IllegalStateException("This is a static utility class and should not be instantiated directly.");
  }
  
  public static void main(final String[] args) {
    try {
      Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      _extensionToFactoryMap.put(Resource.Factory.Registry.DEFAULT_EXTENSION, _xMIResourceFactoryImpl);
      EPackage.Registry.INSTANCE.put(CpsPackage.eNS_URI, CpsPackage.eINSTANCE);
      final CpsGenerator generator = new CpsGenerator(1, 4, 1);
      final CyberPhysicalSystem problem = generator.generateCpsProblem();
      final CpsToLpTranslator toLp = new CpsToLpTranslator(problem, 10, true);
      final CharSequence lp = toLp.getLpProblem();
      FileWriter _fileWriter = new FileWriter(CbcCpsMain.PROBLEM_FILE);
      final BufferedWriter writer = new BufferedWriter(_fileWriter);
      try {
        writer.append(lp);
      } finally {
        writer.close();
      }
      final Process process = new ProcessBuilder().inheritIO().command("cbc", CbcCpsMain.PROBLEM_FILE, "solve", "solu", CbcCpsMain.SOLUTION_FILE).start();
      boolean _waitFor = process.waitFor(120, TimeUnit.SECONDS);
      boolean _not = (!_waitFor);
      if (_not) {
        System.err.println("Timeout reached");
        process.destroyForcibly();
        System.exit((-1));
      }
      int _exitValue = process.exitValue();
      boolean _notEquals = (_exitValue != 0);
      if (_notEquals) {
        int _exitValue_1 = process.exitValue();
        String _plus = ("Unexpected exit value " + Integer.valueOf(_exitValue_1));
        System.err.println(_plus);
        System.exit((-1));
      }
      FileReader _fileReader = new FileReader(CbcCpsMain.SOLUTION_FILE);
      final BufferedReader reader = new BufferedReader(_fileReader);
      try {
        final Consumer<String> _function = (String it) -> {
          InputOutput.<String>println(it);
        };
        reader.lines().forEach(_function);
      } finally {
        reader.close();
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
