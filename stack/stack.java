public class stack {
    int n=5;
    int arr[] = new int[n];
    int top = -1;

    public void insert(int num){
        if(top == n-1){
            System.out.println("stack is full");
        }
        else if(top < n){
            top ++;
            arr[top] = num;
          }
    }
    public void delete(){
        if(top == -1){
            System.out.println("stack is empty");
        }
        else{
            top --;  
        }
    }
    void display(){
        for(int i=0;i<=top;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        
        stack st = new stack();
        st.insert(5);
        st.insert(9);
        st.insert(11);
        st.insert(23);
        st.insert(28);
        
        st.delete();
        st.insert(19);
        // st.delete();
        st.display();   
    }
}
