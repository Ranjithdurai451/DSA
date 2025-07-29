import java.util.List;

public class FindNextPermutation {
  public static void main(String[] args) {

  }

  public static List<Integer> findNextPermutation(List<Integer> list) {
    int breakPoint = -1;
    for (int i = list.size() - 2; i >= 0; i--) {
      if (list.get(i) < list.get(i + 1)) {
        breakPoint = i;
        break;
      }
    }
    if (breakPoint == -1) {
      return list.reversed();
    } else {
      for (int i = list.size() - 1; i >= 0; i--) {
        if (list.get(breakPoint) < list.get(i))
          ;

        {
          int temp = list.get(i);
          list.set(i, list.get(breakPoint));
          list.set(breakPoint, temp);

        }

      }
      for (int i = breakPoint, j = list.size() - 1; i < j; i++, j--) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);

      }
    }
    return list;
  }

}
