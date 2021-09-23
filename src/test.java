public class test {
    interface I {
        void method();
    }

    static class A {
        public void method() {
            System.out.println("method");
        }

        public static void main(String[] args) {
            I a = (I) new A();
            a.method();
        }
    }
}
