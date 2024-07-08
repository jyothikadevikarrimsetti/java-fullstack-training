class External {
    static class Internal {
        void print() {
            System.out.println("External class");

        }
         class  Ex1{

        }

    }
}
// class In1 {
   class Internalclass {
        public static void main(String[] args) {
            External.Internal internal = new External.Internal();
            internal.print();
//            External exe = new External();
//            External.Internal in1 = exe.new Internal();
//            External.Internal.Ex1


        }
    }
//}