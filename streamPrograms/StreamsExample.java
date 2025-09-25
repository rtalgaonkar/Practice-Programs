//package streamPrograms;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//public class StreamsExample {
//    public static void main(String[] args) {
//        Students student1;
//        Students student2;
//        List<Students> students = Arrays.asList(student1, student2);
//
//        Map<String, List<Students>> grouped = students.stream()
//                .collect(Collectors.groupingBy(stu-> {
//                    if (stu.marks<50) return "below 50";
//                    if (stu.marks>50 && stu.marks <80) return "between 50 & 80";
//                    else return "above 80";
//                }));
//String str = "rajul ruchit shaarvee rajvee";
//var list = List.of(str);
//
//    }
//}
//
//class Students {
//    String name;
//    Integer marks;
//}
