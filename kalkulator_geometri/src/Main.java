import java.util.Scanner;
import utils.Balok;
import utils.Kubus;
import utils.Prisma;
import utils.Tabung;
import utils.Lingkaran;
import utils.Persegi;
import utils.PersegiPanjang;
import utils.Segitiga;

public class Main {

    public static int pilihBangun() {
        System.out.println("Pilih Geometri: \n1. Bangun Datar \n2. Bangun Ruang");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                int pilihan = Integer.parseInt(scanner.nextLine());
                if (pilihan == 1 || pilihan == 2) {
                    return pilihan;
                }
                System.out.println("Masukan hanya integer 1-2");
            } catch (NumberFormatException e) {
                System.out.println("Masukan hanya integer 1-2");
            }
        }
    }

    public static int[] pilihSpesifik(int inpt) {
        Scanner scanner = new Scanner(System.in);

        if (inpt == 1) {
            System.out.println("Pilih bangun datar : \n1. Lingkaran \n2. Persegi \n3. Persegi panjang \n4. Segitiga");

            while (true) {
                try {
                    int pilihan = Integer.parseInt(scanner.nextLine());
                    if (pilihan >= 1 && pilihan <= 4) {
                        return new int[]{inpt, pilihan};
                    }
                    System.out.println("Masukan hanya integer 1-4");
                } catch (NumberFormatException e) {
                    System.out.println("Masukan hanya integer 1-4");
                }
            }
        } else if (inpt == 2) {
            System.out.println("Pilih bangun Ruang : \n1. Tabung \n2. Kubus \n3. Balok \n4. Prisma");

            while (true) {
                try {
                    int pilihan = Integer.parseInt(scanner.nextLine());
                    if (pilihan >= 1 && pilihan <= 4) {
                        return new int[]{inpt, pilihan};
                    }
                    System.out.println("Masukan hanya integer 1-4");
                } catch (NumberFormatException e) {
                    System.out.println("Masukan hanya integer 1-4");
                }
            }
        }

        return null;
    }

    public static void kalkulasiBangunDatar(int[] input) {
        Scanner scanner = new Scanner(System.in);

        if (input[1] == 1) {
            try {
                System.out.print("Masukan jari-jari: ");
                double jariJari = Double.parseDouble(scanner.nextLine());
                String nama = "Lingkaran";
                String desc = "Lingkaran adalah suatu bangun datar yang setiap titik pada kelilingnya mempunyai jarak yang sama ke pusatnya";
                Lingkaran lingkaran = new Lingkaran(jariJari, nama, desc);

                if (input[2] == 1) {
                    System.out.println(lingkaran.getNama() + " memiliki luas " + lingkaran.luas());
                } else if (input[2] == 2) {
                    System.out.println(lingkaran.getNama() + " memiliki keliling " + lingkaran.keliling());
                }
            } catch (NumberFormatException e) {
                System.out.println("Jari-jari harus bilangan real");
            }
        } else if (input[1] == 2) {
            try {
                System.out.print("Masukan Sisi: ");
                double sisi = Double.parseDouble(scanner.nextLine());
                String nama = "Persegi";
                String desc = "Persegi adalah suatu bangun datar yang memiliki 4 sisi yang sama panjangnya";
                Persegi persegi = new Persegi(nama, desc, sisi);

                if (input[2] == 1) {
                    System.out.println(persegi.getNama() + " memiliki luas " + persegi.luas());
                } else if (input[2] == 2) {
                    System.out.println(persegi.getNama() + " memiliki keliling " + persegi.keliling());
                }
            } catch (NumberFormatException e) {
                System.out.println("Sisi harus bilangan real");
            }
        } else if (input[1] == 3) {
            try {
                System.out.print("Masukan panjang: ");
                double panjang = Double.parseDouble(scanner.nextLine());
                System.out.println("");
                System.out.print("Masukan lebar: ");
                double lebar = Double.parseDouble(scanner.nextLine());
                String nama = "Persegi Panjang";
                String desc = "Persegi Panjang dalah suatu bangun datar yang memiliki 4 sisi dengan sisi-sisi yang berhadapan sama panjangnya";
                PersegiPanjang persegiPanjang = new PersegiPanjang(nama, desc, panjang, lebar);

                if (input[2] == 1) {
                    System.out.println(persegiPanjang.getNama() + " memiliki luas " + persegiPanjang.luas());
                } else if (input[2] == 2) {
                    System.out.println(persegiPanjang.getNama() + " memiliki keliling " + persegiPanjang.keliling());
                }
            } catch (NumberFormatException e) {
                System.out.println("Panjang atau lebar harus bilangan real");
            }
        } else if (input[1] == 4) {
            try {
                System.out.print("Masukan alas: ");
                double alas = Double.parseDouble(scanner.nextLine());
                System.out.print("Masukan tinggi: ");
                double tinggi = Double.parseDouble(scanner.nextLine());
                System.out.print("Masukan sisi2: ");
                double sisi2 = Double.parseDouble(scanner.nextLine());
                System.out.print("Masukan sisi3: ");
                double sisi3 = Double.parseDouble(scanner.nextLine());
                String nama = "Segitiga";
                String desc = "Segitiga adalah suatu bangun datar yang memiliki 3 sisi";
                Segitiga segitiga = new Segitiga(nama, desc, alas, tinggi, sisi2, sisi3);

                if (input[2] == 1) {
                    System.out.println(segitiga.getNama() + " memiliki luas " + segitiga.luas());
                } else if (input[2] == 2) {
                    System.out.println(segitiga.getNama() + " memiliki keliling " + segitiga.keliling());
                }
            } catch (NumberFormatException e) {
                System.out.println("Alas, tinggi, sisi2, dan sisi3 harus bilangan real");
            }
        }
    }

    public static void kalkulasiBangunRuang(int[] input) {
        Scanner scanner = new Scanner(System.in);

        if (input[1] == 1) {
            try {
                System.out.print("Masukan jari-jari: ");
                double jariJari = Double.parseDouble(scanner.nextLine());
                System.out.print("Masukan tinggi: ");
                double tinggi = Double.parseDouble(scanner.nextLine());
                String nama = "Tabung";
                String desc = "Tabung adalah suatu bangun ruang yang memiliki alas lingkaran dan sebuah tinggi";
                Tabung tabung = new Tabung(nama, desc, jariJari, tinggi);

                if (input[2] == 1) {
                    System.out.println(tabung.getNama() + " memiliki volume " + tabung.volume());
                } else if (input[2] == 2) {
                    System.out.println(tabung.getNama() + " memiliki luas permukaan " + tabung.luaspermukaan());
                }
            } catch (NumberFormatException e) {
                System.out.println("Jari-jari atau tinggi harus bilangan real");
            }
        } else if (input[1] == 2) {
            try {
                System.out.print("Masukan sisi: ");
                double sisi = Double.parseDouble(scanner.nextLine());
                String nama = "Kubus";
                String desc = "Kubus adalah suatu bangun ruang yang memiliki sisi-sisi yang sama panjangnya";
                Kubus kubus = new Kubus(nama, desc, sisi);

                if (input[2] == 1) {
                    System.out.println(kubus.getNama() + " memiliki volume " + kubus.volume());
                } else if (input[2] == 2) {
                    System.out.println(kubus.getNama() + " memiliki luas permukaan " + kubus.luaspermukaan());
                }
            } catch (NumberFormatException e) {
                System.out.println("Sisi harus bilangan real");
            }
        } else if (input[1] == 3) {
            try {
                System.out.print("Masukan panjang: ");
                double panjang = Double.parseDouble(scanner.nextLine());
                System.out.print("Masukan lebar: ");
                double lebar = Double.parseDouble(scanner.nextLine());
                System.out.print("Masukan tinggi: ");
                double tinggiBalok = Double.parseDouble(scanner.nextLine());
                String nama = "Balok";
                String desc = "Balok adalah suatu bangun ruang yang memiliki alas persegi panjang dengan tinggi";
                Balok balok = new Balok(nama, desc, panjang, lebar, tinggiBalok);

                if (input[2] == 1) {
                    System.out.println(balok.getNama() + " memiliki volume " + balok.volume());
                } else if (input[2] == 2) {
                    System.out.println(balok.getNama() + " memiliki luas permukaan " + balok.luaspermukaan());
                }
            } catch (NumberFormatException e) {
                System.out.println("Panjang, lebar, dan tinggi harus bilangan real");
            }
        } else if (input[1] == 4) {
            try {
                System.out.print("Masukan alas: ");
                double alas = Double.parseDouble(scanner.nextLine());
                System.out.print("Masukan tinggi: ");
                double tinggiSegitiga = Double.parseDouble(scanner.nextLine());
                System.out.print("Masukan sisi2: ");
                double sisi2 = Double.parseDouble(scanner.nextLine());
                System.out.print("Masukan sisi3: ");
                double sisi3 = Double.parseDouble(scanner.nextLine());
                System.out.print("Masukan tinggi prisma: ");
                double tinggiPrisma = Double.parseDouble(scanner.nextLine());
                String nama = "Prisma";
                String desc = "Prisma adalah suatu bangun ruang yang memiliki alas segitiga dan tinggi";
                Prisma prisma = new Prisma(nama, desc, alas, tinggiSegitiga, sisi2, sisi3, tinggiPrisma);

                if (input[2] == 1) {
                    System.out.println(prisma.getNama() + " memiliki volume " + prisma.volume());
                } else if (input[2] == 2) {
                    System.out.println(prisma.getNama() + " memiliki luas permukaan " + prisma.luaspermukaan());
                }
            } catch (NumberFormatException e) {
                System.out.println("Semua nilai harus bilangan real");
            }
        }
    }

    public static void main(String[] args) {
        while (true){
            Scanner scanner = new Scanner(System.in);

            int[] input = pilihSpesifik(pilihBangun());

            if (input[0] == 1) {
                System.out.println("Apa yang ingin dihitung : \n1. Luas \n2. Keliling");
                while (true) {
                    try {
                        int pilihan = Integer.parseInt(scanner.nextLine());
                        if (pilihan == 1 || pilihan == 2) {
                            kalkulasiBangunDatar(new int[]{input[0], input[1], pilihan});
                            break;
                        } else {
                            System.out.println("Masukan hanya integer 1-2");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Masukan hanya integer 1-2");
                    }
                }
            } else if (input[0] == 2) {
                System.out.println("Apa yang ingin dihitung : \n1. Volume \n2. Luas Permukaan");
                while (true) {
                    try {
                        int pilihan = Integer.parseInt(scanner.nextLine());
                        if (pilihan == 1 || pilihan == 2) {
                            kalkulasiBangunRuang(new int[]{input[0], input[1], pilihan});
                            break;
                        } else {
                            System.out.println("Masukan hanya integer 1-2");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Masukan hanya integer 1-2");
                    }
                }
            }

            System.out.print("Apa masih mau menghitung yang lain? (y/n): ");
            String con = scanner.nextLine().toLowerCase();
            if (con.equals("n")) {
                System.out.println("Terima kasih telah menggunakan aplikasi");
                break;
            }
        
    }
    }
}
