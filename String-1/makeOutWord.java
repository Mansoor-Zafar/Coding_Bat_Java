public String makeOutWord(String out, String word) 
{
  String res = out.substring(0, out.length() / 2) + word 
             + out.substring(out.length() / 2, out.length());
  return res;
}
