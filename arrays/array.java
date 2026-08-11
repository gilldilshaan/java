public class array {
    public static void main(String[] args) {
        int max=0;
        String l="";
        String str = "cat dog cat donkey cat donkey donkey donkey";
        String a[]=str.split(" ");
        for(int i=0;i<a.length;i++){
            int count=0;
            for(int j=0;j<a.length;j++){
                if(a[i].equals(a[j])){
                 count++;
                }
            }
            if(count>max){
                max=count;
                l=a[i];
            }
        }
        System.out.print(l);
    }
}
