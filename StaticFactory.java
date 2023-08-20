public class StaticFactory {
    public static void main(String[] args) {
        for(int x : Methods.of(1, 2, 3)) {
            System.out.println(x);
        }
    }

    class Methods {
        public static int[] of(int ...params) { 
            return params; 
        }
    }
}