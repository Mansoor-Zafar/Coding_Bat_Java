public String withoutX2(String str) 
{
  StringBuilder res = new StringBuilder("");
  for(int i = 0; i < str.length(); ++i)
  {
      if(i < 2 && str.charAt(i) == 'x') continue;
      res.append(str.charAt(i));
  }
  return res.toString();
}
