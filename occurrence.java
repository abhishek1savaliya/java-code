public class occurrence {
    public static void main(String[] args) {

        int arr[] = {1,1,2,3,40,40,8,2,6,6,2,3,3,3,2,9};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                  max = arr[i];
            }
        }

        System.out.println("Elem  Occur");
        for(int i=1;i<=max;i++){
             int x=i,p=0;
             for(int j=0;j<arr.length;j++){
                if(x==arr[j]){
                    p++;
                }
             }
             if(p==0){

             }else{
                System.out.println(x+"  =   "+p);
                p=0;
             }   
        }
    }
}
