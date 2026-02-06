public class StringInfo {
    public static void main(String[] args) {
        String name = "Vaibhav";
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf("a"));
        System.out.println(name.substring(0, 3));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.replace("a", "A"));
        System.out.println(name.trim());
        System.out.println(name.isEmpty());
        System.out.println(name.contains("a"));
        System.out.println(name.startsWith("V"));
        System.out.println(name.endsWith("b"));
        System.out.println(name.equals("Vaibhav"));
        System.out.println(name.equalsIgnoreCase("vaibhav"));
        System.out.println(name.compareTo("Vaibhav"));
        System.out.println(name.compareToIgnoreCase("vaibhav"));
        System.out.println(name.replaceAll("a", "A"));
    }
}