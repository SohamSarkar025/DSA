public class Performance {
    public static void main(String[] args) {
        String series ="";
        for(int i=0;i<26;i++){
            char ch = (char)('a'+i);
            series += ch;
        }
        System.out.println(series);
        //Every time in series there internally making a new object
        //Thats why we need StringBuilder
    }
}
