public boolean lastDigit(int a, int b) {
  String temporaryA = a + "";
  String temporaryB = b + "";
  return temporaryA.substring(temporaryA.length()-1, temporaryA.length())
  .equals(temporaryB.substring(temporaryB.length()-1, temporaryB.length()));
}
