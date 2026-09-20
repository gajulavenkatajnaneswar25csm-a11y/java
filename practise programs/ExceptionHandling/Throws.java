class sam {
    void divide() throws ArithmeticException{
        int a = 69,b = 0;
        int k = a/b;
        System.out.println("k value is :" + k);
    }
    public class Throws {
    
        public static void main(String[] args) {
            sam obj=new sam();
            try{
                obj.divide();
            }
            catch(ArithmeticException e){
                System.out.println("b is equal to zero");
            }
            finally{
                System.out.println("program is executed");
            }
            }
        }
    }