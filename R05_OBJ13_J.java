// Rule 05. Object Orientation (OBJ)
// OBJ13-J. Ensure that references to mutable objects are not exposed

private static final SomeType [] SOMETHINGS = { ... };
public static final SomeType [] somethings() {
  return SOMETHINGS.clone();
}