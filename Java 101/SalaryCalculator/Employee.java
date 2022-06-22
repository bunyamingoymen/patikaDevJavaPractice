public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;
    double vergi;
    double bonus;
    double maasArtisi;


    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public void tax(){
        if(this.salary>1000)
            this.vergi = (double) ((this.salary * 3)/100);
    }

    public void bonus(){
        if(this.workHours>40)
            this.bonus = (double) ( (this.workHours - 40) * 30 );
    }

    public void raiseSalary(){
        if(this.hireYear<10)
            this.maasArtisi = (double) (this.salary *5)/100;
        else if ( this.hireYear >= 10 && this.hireYear<20)
            this.maasArtisi = (double) (this.salary * 10)/100;
        else if(this.hireYear >= 20)
            this.maasArtisi = (double) (this.salary * 15)/100;

    }

    public String toString(){
        return "Adı: " + this.name + "\nMaaşı: " + this.salary + "\nÇalışma Saati: " + this.workHours
                + "\nBaşlangıç yılı: " + this.hireYear + "\nVergi: " + this.vergi + "\nBonus: " + bonus
                + "\nMaaş Artışı: " + maasArtisi + "\nVergi ve Bonuslar ile birlikte maaş: "
                + (this.salary + this.bonus - this.vergi) + "\nToplam Maaş: " + (this.salary + this.maasArtisi);
    }
}
