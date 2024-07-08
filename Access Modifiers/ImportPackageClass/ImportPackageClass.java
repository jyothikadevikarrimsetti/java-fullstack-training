package ImportPackageClass;


import ExportPackage.ExportPackageClass;

public class ImportPackageClass extends ExportPackageClass {
    public static void main(String[] args) {

        System.out.println(new ImportPackageClass().finalPublicVar);
    }
}
