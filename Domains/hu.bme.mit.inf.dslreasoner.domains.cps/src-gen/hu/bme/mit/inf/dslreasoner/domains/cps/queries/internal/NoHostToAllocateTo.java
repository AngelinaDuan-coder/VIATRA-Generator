/**
 * Generated from platform:/resource/hu.bme.mit.inf.dslreasoner.domains.cps/src/hu/bme/mit/inf/dslreasoner/domains/cps/queries/CpsQueries.vql
 */
package hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal;

import hu.bme.mit.inf.dslreasoner.domains.cps.queries.Allocate;
import hu.bme.mit.inf.dslreasoner.domains.cps.queries.internal.UnallocatedAppInstance;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecificationWithGenericMatcher;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;

/**
 * A pattern-specific query specification that can instantiate GenericPatternMatcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         private pattern noHostToAllocateTo(App : ApplicationInstance) {
 *         	find unallocatedAppInstance(App);
 *         	neg find allocate(App, _);
 *         }
 * </pre></code>
 * 
 * @see GenericPatternMatcher
 * @see GenericPatternMatch
 * 
 */
@SuppressWarnings("all")
public final class NoHostToAllocateTo extends BaseGeneratedEMFQuerySpecificationWithGenericMatcher {
  private NoHostToAllocateTo() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static NoHostToAllocateTo instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  /**
   * Inner class allowing the singleton instance of {@link NoHostToAllocateTo} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link NoHostToAllocateTo#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final NoHostToAllocateTo INSTANCE = new NoHostToAllocateTo();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private static final Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternal();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private static final NoHostToAllocateTo.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_App = new PParameter("App", "hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/cps", "ApplicationInstance")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_App);
    
    private GeneratedPQuery() {
      super(PVisibility.PRIVATE);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.dslreasoner.domains.cps.queries.noHostToAllocateTo";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("App");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() {
      setEvaluationHints(new QueryEvaluationHint(null, QueryEvaluationHint.BackendRequirement.UNSPECIFIED));
      Set<PBody> bodies = new LinkedHashSet<>();
      {
          PBody body = new PBody(this);
          PVariable var_App = body.getOrCreateVariableByName("App");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_App), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/cps", "ApplicationInstance")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_App, parameter_App)
          ));
          // 	find unallocatedAppInstance(App)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_App), UnallocatedAppInstance.instance().getInternalQueryRepresentation());
          // 	neg find allocate(App, _)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_App, var___0_), Allocate.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
