package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
        // Boyutları burada sabit olarak veriyoruz (Örn: 5, 10 veya 100)
        // Bu sayede constructor parametrelerinde juniorSize vs. tutmana gerek kalmaz.
        this.juniorDevelopers = new JuniorDeveloper[10];
        this.midDevelopers = new MidDeveloper[10];
        this.seniorDevelopers = new SeniorDeveloper[10];
    }

    @Override
    public void work() {
        System.out.println("HRManager starts to working");
        setSalary(getSalary() + 1000);
    }

    public void addEmployee(int index, JuniorDeveloper developer) {
        try {
            if (juniorDevelopers[index] == null) {
                juniorDevelopers[index] = developer;
                System.out.println("Junior eklendi: " + developer.getName());
            } else {
                System.out.println("Uyarı: Bu index zaten dolu!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hata: Geçersiz index! " + index);
        }
    }

    public void addEmployee(int index, MidDeveloper developer) {
        try {
            if (midDevelopers[index] == null) {
                midDevelopers[index] = developer;
                System.out.println("Mid eklendi: " + developer.getName());
            } else {
                System.out.println("Uyarı: Bu index zaten dolu!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hata: Geçersiz index! " + index);
        }
    }

    public void addEmployee(int index, SeniorDeveloper developer) {
        try {
            if (seniorDevelopers[index] == null) {
                seniorDevelopers[index] = developer;
                System.out.println("Senior eklendi: " + developer.getName());
            } else {
                System.out.println("Uyarı: Bu index zaten dolu!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hata: Geçersiz index! " + index);
        }
    }
}