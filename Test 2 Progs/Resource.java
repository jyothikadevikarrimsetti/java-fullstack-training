//public class Finalize {
    public class Resource {
//        @Override
//        protected void finalize() throws Throwable {
//            try {
//                // Cleanup code here
//                System.out.println("Resource is being garbage collected");
//            } finally {
//                super.finalize();
//            }
//        }

        public static void main(String[] args) {
//            Resource resource = new Resource();
//            resource = null;
            System.gc(); // Suggests the JVM to run the garbage collector
        }
    }
//}
