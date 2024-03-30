class StringExam {
    public static void main(String[]ar){
           String str="tonight";
           System.out.println(str.indexOf('u'));
           System.out.println(str.indexOf('t',4));
           String subString="ton";

           System.out.println(str.indexOf(subString));
           System.out.println(str.indexOf(subString,7));
}
}