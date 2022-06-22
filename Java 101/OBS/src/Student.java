public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int matSozlu, int fizik, int fizikSozlu, int kimya, int kimyaSozlu) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if(matSozlu >= 0 && matSozlu<= 100){
            this.mat.sozluNotu = matSozlu;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if(fizikSozlu >= 0 && fizikSozlu<= 100){
            this.fizik.sozluNotu = fizikSozlu;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

        if(kimyaSozlu >= 0 && kimyaSozlu<= 100){
            this.kimya.sozluNotu = kimyaSozlu;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.mat.sozluNotu == 0 || this.fizik.note == 0 || this.fizik.sozluNotu == 0 || this.kimya.note == 0 || this.kimya.sozluNotu == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        double fizikSozluEtkisi = (double) this.fizik.sozluNotuEffect / 100;
        double fizikNoteEtkisi = (double) 1.00 - fizikSozluEtkisi;

        int fizikNote = (int) (fizikSozluEtkisi * this.fizik.sozluNotu) + (int) (fizikNoteEtkisi * this.fizik.note);

        double kimyaSozluEtkisi = (double) this.kimya.sozluNotuEffect / 100;
        double kimyaNoteEtkisi = (double) 1.00 - kimyaSozluEtkisi;

        int kimyaNote = (int) (fizikSozluEtkisi * this.kimya.sozluNotu) + (int) (kimyaNoteEtkisi * this.kimya.note);

        double matSozluEtkisi = (double) this.mat.sozluNotuEffect / 100;
        double matNoteEtkisi = (double) 1.00 - matSozluEtkisi;

        int matNote= (int) (matSozluEtkisi * this.mat.sozluNotu) + (int) (matNoteEtkisi * this.mat.note);

        this.avarage = (fizikNote + kimyaNote + matNote) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Matematik Sözlü Notu: " + this.mat.sozluNotu);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Fizik Sözlü Notu: " + this.fizik.sozluNotu);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Kimya Sözlü Notu: " + this.kimya.sozluNotu);
    }

}