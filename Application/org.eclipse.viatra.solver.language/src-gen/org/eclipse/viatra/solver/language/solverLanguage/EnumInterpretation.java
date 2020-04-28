/**
 * generated by Xtext 2.18.0.M3
 */
package org.eclipse.viatra.solver.language.solverLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Interpretation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.EnumInterpretation#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.eclipse.viatra.solver.language.solverLanguage.EnumInterpretation#getObjects <em>Objects</em>}</li>
 * </ul>
 *
 * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getEnumInterpretation()
 * @model
 * @generated
 */
public interface EnumInterpretation extends CDInterpretation
{
  /**
   * Returns the value of the '<em><b>Symbol</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Symbol</em>' containment reference.
   * @see #setSymbol(ModelSymbol)
   * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getEnumInterpretation_Symbol()
   * @model containment="true"
   * @generated
   */
  ModelSymbol getSymbol();

  /**
   * Sets the value of the '{@link org.eclipse.viatra.solver.language.solverLanguage.EnumInterpretation#getSymbol <em>Symbol</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Symbol</em>' containment reference.
   * @see #getSymbol()
   * @generated
   */
  void setSymbol(ModelSymbol value);

  /**
   * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.viatra.solver.language.solverLanguage.NamedObject}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objects</em>' containment reference list.
   * @see org.eclipse.viatra.solver.language.solverLanguage.SolverLanguagePackage#getEnumInterpretation_Objects()
   * @model containment="true"
   * @generated
   */
  EList<NamedObject> getObjects();

} // EnumInterpretation
