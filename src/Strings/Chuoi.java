package Strings;

public class Chuoi {

    String s;

    void input() {
        s = "Lop CS311 AC - Hoc Java";
    }

    int demKyTuTrang(String st) {
        int dem = 0;
        for (int i = 0; i < st.length(); i++) {
            if (Character.isWhitespace(st.charAt(i))) {
                dem++;
            }
        }
        return dem;
    }

    int demKyTuHoa(String st) {
        int dem = 0;
        for (int i = 0; i < st.length(); i++) {
            if (Character.isUpperCase(st.charAt(i))) {
                dem++;
            }
        }
        return dem;
    }

    int demKyTuThuong(String st) {
        int dem = 0;
        for (int i = 0; i < st.length(); i++) {
            if (Character.isLowerCase(st.charAt(i))) {
                dem++;
            }
        }
        return dem;
    }

    int demKyTuAlphabe(String st) {
        int dem = 0;
        for (int i = 0; i < st.length(); i++) {
            if (Character.isLetter(st.charAt(i))) {
                dem++;
            }
        }
        return dem;
    }

    int demKyTuSo(String st) {
        int dem = 0;
        for (int i = 0; i < st.length(); i++) {
            if (Character.isDigit(st.charAt(i))) {
                dem++;
            }
        }
        return dem;
    }

    int demKyTuDacBiet(String st) {
        int dem = 0;
        for (int i = 0; i < st.length(); i++) {
            if (!Character.isLetterOrDigit(st.charAt(i)) && !Character.isWhitespace(st.charAt(i))) {
                dem++;
            }
        }
        return dem;
    }

    int demSoTuTrongChuoi(String st) {
        String[] tu = st.split("\\s+");
        return tu.length;
    }

    String tuDaiNhatTrongChuoi(String st) {
        String[] tu = st.split("\\s+");
        String tuDaiNhat = tu[0];

        for (int i = 1; i < tu.length; i++) {
            if (tu[i].length() > tuDaiNhat.length()) {
                tuDaiNhat = tu[i];
            }
        }
        return tuDaiNhat;
    }

    void output() {
        System.out.println("S: " + s + ":");
        System.out.println("1. So ky tu trang: " + demKyTuTrang(s));
        System.out.println("2. So ky tu hoa: " + demKyTuHoa(s));
        System.out.println("3. So ky tu thuong: " + demKyTuThuong(s));
        System.out.println("4. So ky alphabe: " + demKyTuAlphabe(s));
        System.out.println("5. So ky tu so: " + demKyTuSo(s));
        System.out.println("6. So ky dac biet: " + demKyTuDacBiet(s));
        System.out.println("7. So tu trong chuoi: " + demSoTuTrongChuoi(s));
        System.out.println("8. Tu dai nhat trong chuoi: " + tuDaiNhatTrongChuoi(s));
    }

    public static void main(String[] args) {
        Chuoi a = new Chuoi();
        a.input();
        a.output();
    }
}
