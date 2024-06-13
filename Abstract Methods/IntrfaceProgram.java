
    interface data{
        void connect();
        void disconnect();
    }
    class python implements data{
        public void connect(){
            System.out.println("connecting to python");
        }
        public void disconnect(){
            System.out.println("disconnecting to python");
        }
    }
    class java implements data{
        public void connect(){
            System.out.println("connecting to java");
        }
        public void disconnect(){
            System.out.println("java disconnected");
        }
    }
    class InterfaceProgram{
        public static void main(String args[]){
            python py = new python();
            java ja = new java();
            py.connect();
            py.disconnect();
            ja.connect();
            ja.disconnect();
        }
    }

