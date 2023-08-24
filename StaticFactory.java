public class StaticFactory {
    public static void main(String[] args) {
        for(int x : Methods.of(1, 2, 3)) {
            System.out.println(x);
        }

        Methods.from(new StaticFactory());
    }

    class Methods {
        public static int[] of(int ...params) { 
            return params; 
        }

        public static <T extends StaticFactory> T from(T param) {
            return param;
        }
    }
}