package baekjoon.tuto;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class TutorialSolution {

  public static class Main1 {
    public static void main(String[] args) {
      System.out.print("Hello World!");
    }
  }


  public static class Main2 {
    public static void main(String[] args) {
      String currentDate = new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA).format(new Date());
      System.out.print(currentDate);
    }
  }

  public static class Main3 {
    public static void main(String[] args) {
      System.out.println(7);
      System.out.println("kdkrkwhr");
    }
  }

  public static class Main4 {
    public static void main(String[] args) {
      System.out.println("\\    /\\");
      System.out.println(" )  ( ')");
      System.out.println("(  /  )");
      System.out.println(" \\(__)|");
    }
  }

  public static class Main5 {
    public static void main(String[] args) {
      System.out.println("|\\_/|");
      System.out.println("|q p|   /}");
      System.out.println("( 0 )\"\"\"\\");
      System.out.println("|\"^\"`    |");
      System.out.println("||_/=\\\\__|");
    }
  }

  public static class Main6 {
    public static void main(String[] args) {
      System.out.println("         ,r'\"7");
      System.out.println("r`-_   ,'  ,/");
      System.out.println(" \\. \". L_r'");
      System.out.println("   `~\\/");
      System.out.println("      |");
      System.out.println("      |");
    }
  }

  public static class Main7 {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int A = in.nextInt();
      int B = in.nextInt();
      System.out.println(A + B);
      in.close();
    }
  }

  public static class Main8 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      System.out.println(a - b);
    }
  }

  public static class Main9 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      System.out.println(a * b);
    }
  }

  public static class Main10 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      System.out.println(a + b);
      System.out.println(a - b);
      System.out.println(a * b);
      System.out.println(a / b);
      System.out.println(a % b);
    }
  }

  public static class Main11 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double a = sc.nextInt();
      double b = sc.nextInt();
      double c = a / b;
      System.out.println(c);
    }
  }

  public static class Main12 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String numberStr = sc.nextLine();
      String[] numbers = numberStr.split(" ");

      System.out.println(
          Long.parseLong(numbers[0]) + Long.parseLong(numbers[1]) + Long.parseLong(numbers[2]));
    }
  }

  public static class Main13 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String[] numberStr = sc.nextLine().split(" ");
      int a = Integer.parseInt(numberStr[0]);
      int b = Integer.parseInt(numberStr[1]);

      if (a > b) {
        System.out.println(">");

      } else if (a < b) {
        System.out.println("<");

      } else if (a == b) {
        System.out.println("==");
      }
    }
  }

  public static class Main14 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int score = sc.nextInt();
      String grade;

      if (90 <= score && score <= 100) {
        grade = "A";
      } else if (80 <= score && score < 90) {
        grade = "B";
      } else if (70 <= score && score < 80) {
        grade = "C";
      } else if (60 <= score && score < 70) {
        grade = "D";
      } else {
        grade = "F";
      }

      System.out.println(grade);
    }
  }

  public static class Main15 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      int y = sc.nextInt();
      int quadrant = 0;

      if (0 < x && 0 < y) {
        quadrant = 1;
      } else if (x < 0 && 0 < y) {
        quadrant = 2;
      } else if (x < 0 && y < 0) {
        quadrant = 3;
      } else if (0 < x && y < 0) {
        quadrant = 4;
      }

      System.out.println(quadrant);
    }
  }

  public class Main16 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int year = sc.nextInt();

      if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
        System.out.println(1);
      } else {
        System.out.println(0);
      }
    }
  }
}
