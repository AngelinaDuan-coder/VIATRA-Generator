/**
 * generated by Xtext 2.12.0
 */
package ca.mcgill.ecse.dslreasoner.vampireLanguage.util;

import ca.mcgill.ecse.dslreasoner.vampireLanguage.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireLanguagePackage
 * @generated
 */
public class VampireLanguageSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static VampireLanguagePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VampireLanguageSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = VampireLanguagePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case VampireLanguagePackage.VAMPIRE_MODEL:
      {
        VampireModel vampireModel = (VampireModel)theEObject;
        T result = caseVampireModel(vampireModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VampireLanguagePackage.VLS_INCLUDE:
      {
        VLSInclude vlsInclude = (VLSInclude)theEObject;
        T result = caseVLSInclude(vlsInclude);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VampireLanguagePackage.VLS_NAME:
      {
        VLSName vlsName = (VLSName)theEObject;
        T result = caseVLSName(vlsName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VampireLanguagePackage.VLS_COMMENT:
      {
        VLSComment vlsComment = (VLSComment)theEObject;
        T result = caseVLSComment(vlsComment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VampireLanguagePackage.VLS_FOF_FORMULA:
      {
        VLSFofFormula vlsFofFormula = (VLSFofFormula)theEObject;
        T result = caseVLSFofFormula(vlsFofFormula);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VampireLanguagePackage.VLS_ANNOTATION:
      {
        VLSAnnotation vlsAnnotation = (VLSAnnotation)theEObject;
        T result = caseVLSAnnotation(vlsAnnotation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VampireLanguagePackage.VLS_TERM:
      {
        VLSTerm vlsTerm = (VLSTerm)theEObject;
        T result = caseVLSTerm(vlsTerm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VampireLanguagePackage.VLS_VARIABLE:
      {
        VLSVariable vlsVariable = (VLSVariable)theEObject;
        T result = caseVLSVariable(vlsVariable);
        if (result == null) result = caseVLSTerm(vlsVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VampireLanguagePackage.VLS_FUNCTION_FOF:
      {
        VLSFunctionFof vlsFunctionFof = (VLSFunctionFof)theEObject;
        T result = caseVLSFunctionFof(vlsFunctionFof);
        if (result == null) result = caseVLSTerm(vlsFunctionFof);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VampireLanguagePackage.VLS_DEFINED_TERM:
      {
        VLSDefinedTerm vlsDefinedTerm = (VLSDefinedTerm)theEObject;
        T result = caseVLSDefinedTerm(vlsDefinedTerm);
        if (result == null) result = caseVLSTerm(vlsDefinedTerm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VampireLanguagePackage.VLS_EQUIVALENT:
      {
        VLSEquivalent vlsEquivalent = (VLSEquivalent)theEObject;
        T result = caseVLSEquivalent(vlsEquivalent);
        if (result == null) result = caseVLSTerm(vlsEquivalent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VampireLanguagePackage.VLS_IMPLIES:
      {
        VLSImplies vlsImplies = (VLSImplies)theEObject;
        T result = caseVLSImplies(vlsImplies);
        if (result == null) result = caseVLSTerm(vlsImplies);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VampireLanguagePackage.VLS_REV_IMPLIES:
      {
        VLSRevImplies vlsRevImplies = (VLSRevImplies)theEObject;
        T result = caseVLSRevImplies(vlsRevImplies);
        if (result == null) result = caseVLSTerm(vlsRevImplies);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VampireLanguagePackage.VLS_XNOR:
      {
        VLSXnor vlsXnor = (VLSXnor)theEObject;
        T result = caseVLSXnor(vlsXnor);
        if (result == null) result = caseVLSTerm(vlsXnor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VampireLanguagePackage.VLS_NOR:
      {
        VLSNor vlsNor = (VLSNor)theEObject;
        T result = caseVLSNor(vlsNor);
        if (result == null) result = caseVLSTerm(vlsNor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VampireLanguagePackage.VLS_NAND:
      {
        VLSNand vlsNand = (VLSNand)theEObject;
        T result = caseVLSNand(vlsNand);
        if (result == null) result = caseVLSTerm(vlsNand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VampireLanguagePackage.VLS_AND:
      {
        VLSAnd vlsAnd = (VLSAnd)theEObject;
        T result = caseVLSAnd(vlsAnd);
        if (result == null) result = caseVLSTerm(vlsAnd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VampireLanguagePackage.VLS_OR:
      {
        VLSOr vlsOr = (VLSOr)theEObject;
        T result = caseVLSOr(vlsOr);
        if (result == null) result = caseVLSTerm(vlsOr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VampireLanguagePackage.VLS_UNIVERSAL_QUANTIFIER:
      {
        VLSUniversalQuantifier vlsUniversalQuantifier = (VLSUniversalQuantifier)theEObject;
        T result = caseVLSUniversalQuantifier(vlsUniversalQuantifier);
        if (result == null) result = caseVLSTerm(vlsUniversalQuantifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VampireLanguagePackage.VLS_EXISTENTIAL_QUANTIFIER:
      {
        VLSExistentialQuantifier vlsExistentialQuantifier = (VLSExistentialQuantifier)theEObject;
        T result = caseVLSExistentialQuantifier(vlsExistentialQuantifier);
        if (result == null) result = caseVLSTerm(vlsExistentialQuantifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VampireLanguagePackage.VLS_UNARY_NEGATION:
      {
        VLSUnaryNegation vlsUnaryNegation = (VLSUnaryNegation)theEObject;
        T result = caseVLSUnaryNegation(vlsUnaryNegation);
        if (result == null) result = caseVLSTerm(vlsUnaryNegation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VampireLanguagePackage.VLS_INEQUALITY:
      {
        VLSInequality vlsInequality = (VLSInequality)theEObject;
        T result = caseVLSInequality(vlsInequality);
        if (result == null) result = caseVLSTerm(vlsInequality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VampireLanguagePackage.VLS_EQUALITY:
      {
        VLSEquality vlsEquality = (VLSEquality)theEObject;
        T result = caseVLSEquality(vlsEquality);
        if (result == null) result = caseVLSTerm(vlsEquality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VampireLanguagePackage.VLS_ASSIGNMENT:
      {
        VLSAssignment vlsAssignment = (VLSAssignment)theEObject;
        T result = caseVLSAssignment(vlsAssignment);
        if (result == null) result = caseVLSTerm(vlsAssignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VampireLanguagePackage.VLS_CONSTANT:
      {
        VLSConstant vlsConstant = (VLSConstant)theEObject;
        T result = caseVLSConstant(vlsConstant);
        if (result == null) result = caseVLSTerm(vlsConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VampireLanguagePackage.VLS_TRUE:
      {
        VLSTrue vlsTrue = (VLSTrue)theEObject;
        T result = caseVLSTrue(vlsTrue);
        if (result == null) result = caseVLSTerm(vlsTrue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VampireLanguagePackage.VLS_FALSE:
      {
        VLSFalse vlsFalse = (VLSFalse)theEObject;
        T result = caseVLSFalse(vlsFalse);
        if (result == null) result = caseVLSTerm(vlsFalse);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VampireLanguagePackage.VLS_FUNCTION:
      {
        VLSFunction vlsFunction = (VLSFunction)theEObject;
        T result = caseVLSFunction(vlsFunction);
        if (result == null) result = caseVLSTerm(vlsFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VampireLanguagePackage.VLS_LESS:
      {
        VLSLess vlsLess = (VLSLess)theEObject;
        T result = caseVLSLess(vlsLess);
        if (result == null) result = caseVLSTerm(vlsLess);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VampireLanguagePackage.VLS_INT:
      {
        VLSInt vlsInt = (VLSInt)theEObject;
        T result = caseVLSInt(vlsInt);
        if (result == null) result = caseVLSDefinedTerm(vlsInt);
        if (result == null) result = caseVLSTerm(vlsInt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VampireLanguagePackage.VLS_REAL:
      {
        VLSReal vlsReal = (VLSReal)theEObject;
        T result = caseVLSReal(vlsReal);
        if (result == null) result = caseVLSDefinedTerm(vlsReal);
        if (result == null) result = caseVLSTerm(vlsReal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VampireLanguagePackage.VLS_RATIONAL:
      {
        VLSRational vlsRational = (VLSRational)theEObject;
        T result = caseVLSRational(vlsRational);
        if (result == null) result = caseVLSDefinedTerm(vlsRational);
        if (result == null) result = caseVLSTerm(vlsRational);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VampireLanguagePackage.VLS_DOUBLE_QUOTE:
      {
        VLSDoubleQuote vlsDoubleQuote = (VLSDoubleQuote)theEObject;
        T result = caseVLSDoubleQuote(vlsDoubleQuote);
        if (result == null) result = caseVLSDefinedTerm(vlsDoubleQuote);
        if (result == null) result = caseVLSTerm(vlsDoubleQuote);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Vampire Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Vampire Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVampireModel(VampireModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VLS Include</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VLS Include</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVLSInclude(VLSInclude object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VLS Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VLS Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVLSName(VLSName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VLS Comment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VLS Comment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVLSComment(VLSComment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VLS Fof Formula</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VLS Fof Formula</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVLSFofFormula(VLSFofFormula object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VLS Annotation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VLS Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVLSAnnotation(VLSAnnotation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VLS Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VLS Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVLSTerm(VLSTerm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VLS Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VLS Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVLSVariable(VLSVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VLS Function Fof</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VLS Function Fof</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVLSFunctionFof(VLSFunctionFof object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VLS Defined Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VLS Defined Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVLSDefinedTerm(VLSDefinedTerm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VLS Equivalent</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VLS Equivalent</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVLSEquivalent(VLSEquivalent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VLS Implies</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VLS Implies</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVLSImplies(VLSImplies object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VLS Rev Implies</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VLS Rev Implies</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVLSRevImplies(VLSRevImplies object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VLS Xnor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VLS Xnor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVLSXnor(VLSXnor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VLS Nor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VLS Nor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVLSNor(VLSNor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VLS Nand</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VLS Nand</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVLSNand(VLSNand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VLS And</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VLS And</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVLSAnd(VLSAnd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VLS Or</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VLS Or</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVLSOr(VLSOr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VLS Universal Quantifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VLS Universal Quantifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVLSUniversalQuantifier(VLSUniversalQuantifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VLS Existential Quantifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VLS Existential Quantifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVLSExistentialQuantifier(VLSExistentialQuantifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VLS Unary Negation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VLS Unary Negation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVLSUnaryNegation(VLSUnaryNegation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VLS Inequality</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VLS Inequality</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVLSInequality(VLSInequality object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VLS Equality</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VLS Equality</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVLSEquality(VLSEquality object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VLS Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VLS Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVLSAssignment(VLSAssignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VLS Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VLS Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVLSConstant(VLSConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VLS True</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VLS True</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVLSTrue(VLSTrue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VLS False</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VLS False</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVLSFalse(VLSFalse object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VLS Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VLS Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVLSFunction(VLSFunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VLS Less</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VLS Less</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVLSLess(VLSLess object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VLS Int</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VLS Int</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVLSInt(VLSInt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VLS Real</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VLS Real</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVLSReal(VLSReal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VLS Rational</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VLS Rational</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVLSRational(VLSRational object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>VLS Double Quote</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>VLS Double Quote</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVLSDoubleQuote(VLSDoubleQuote object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //VampireLanguageSwitch
