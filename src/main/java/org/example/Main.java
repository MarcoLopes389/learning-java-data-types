package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tipos primitivos:");

        System.out.println("O double é o número de ponto flutuante de maior tamanho");
        double doubleNumber = 3.5;
        System.out.println(doubleNumber);
        System.out.println("O float ainda é grande, porém é menor que o double");
        float floatNumber = 5.7F;
        System.out.println(floatNumber);

        System.out.println("Um número do tipo byte é para números bem pequenos, vai até 127");
        byte byteNumber = 127;
        System.out.println(byteNumber);
        System.out.println("O short é um pouco maior e vai até 32000 e pouco");
        short shortNumber = 9;
        System.out.println(shortNumber);
        System.out.println("O int é maior e vai até 2bi");
        int integer = 30;
        System.out.println(integer);
        System.out.println("O long é extremamente grande, nem sei até onde vai");
        long longNumber = 13;
        System.out.println(longNumber);

        System.out.println("O tipo char é para caracteres isolados, só consegue armazenar um");
        char charValue = 'T';
        System.out.println(charValue);
        System.out.println("O tipo boolean é um tipo mais simples, armazena true ou false");
        boolean booleanValue = true;
        System.out.println(booleanValue);

        Double otherDoubleNumber = 3.5;
        Float otherFloatNumber = 5.7F;
        Short otherShortNumber = 10;
        Long otherLongNumber = 1L;
        Byte otherByteNumber = 35;
        Character otherCharValue = 'T';
        Boolean otherBooleanValue = true;

        System.out.println("Tipos não primitivos:");
        System.out.println("O tipo String é como nas outras linguagens, um array de chars");
        String stringValue = "Um teste qualquer";
        System.out.println(stringValue);

        System.out.println("Existem 4 tipos de se criar um array: array de tipos, Vector, LinkedList, ArrayList");
        System.out.println("O vetor de tipos pode ser instanciado de forma simples, porém ele tem uma quantidade de itens fixo");
        int[] vetor = new int[8];
        System.out.println(Arrays.toString(vetor));
        System.out.println("Existe um outro tipo de vetor instanciado por classe, com quantidade dinâmica, porém menos eficiente que os outros tipos");
        Vector<String> vector = new Vector<>();
        System.out.println(vector);
        System.out.println("O outro tipo que temos é o Linked, cada item aponta pro próximo e pro anterior, logo é mais eficiente para adicionar e remover itens");
        LinkedList<String> linkedList = new LinkedList<>();
        System.out.println(linkedList);
        System.out.println("Já a ArrayList é um array que possibilita acessos mais rápidos aos itens, porém a remoção e adição é mais lenta");
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println(arrayList);

        System.out.println("Existem 3 tipos de forma de criar um set: HashSet, TreeSet e LinkedHashSet");
        System.out.println("O HashSet é um tipo que se baseia em uma tabela hash, que converte o valores em inteiro, é mais eficiente pra achar itens mas não garante ordenação");
        HashSet<Integer> hashSet = new HashSet<>();
        System.out.println(hashSet);
        System.out.println("O TreeSet mantém os itens ordenados como árvore binária, menos eficiente mas garante ordenação");
        TreeSet<Integer> treeSet = new TreeSet<>();
        System.out.println(treeSet);
        System.out.println("O tipo Linked combina a eficiência da tabela hash com o apontamento para o próximo e anterior, tendo bastante eficiência para encontrar itens e adicionar e remover itens");
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        System.out.println(linkedHashSet);

        System.out.println("O tipo Map é o típico tipo de chave valor, existem 3 maneiras: TreeMap, HashMap e LinkedHashMap");
        System.out.println("Eles não diferem muito dos Sets, apenas na parte de ter dois itens, a chave e o valor");
        TreeMap<String, String> treeMap = new TreeMap<>();
        HashMap<String, String> hashMap = new HashMap<>();
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("chave", "Teste");
        linkedHashMap.get("chave");
        System.out.print(treeMap);
        System.out.print(hashMap);
        System.out.println(linkedHashMap);

        System.out.println("Os outros tipos que existem são as pilhas e filas: Queue e Stack");
        Stack<String> stack = new Stack<>();
        stack.add("Teste");
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Teste");
        System.out.print(stack);
        System.out.println(queue);

        System.out.println("Alguns métodos para trabalhar com String:");
        System.out.printf("replace: %s\n", stringValue.replace("e", ""));
        System.out.printf("isEmpty: %s\n", stringValue.isEmpty());
        System.out.printf("equals: %s\n", stringValue.equals("Um teste qualquer"));
        System.out.printf("toCharArray: %s\n", Arrays.toString(stringValue.toCharArray()));
        System.out.printf("trim: %s\n", stringValue.trim());
        System.out.printf("toLowerCase: %s\n", stringValue.toLowerCase());
        System.out.printf("toUpperCase: %s\n", stringValue.toUpperCase());
        System.out.printf("contains: %s\n", stringValue.contains("e"));
        System.out.printf("substring: %s\n", stringValue.substring(3, 15));
        System.out.printf("length: %s\n", stringValue.length());
        System.out.printf("concat: %s\n", stringValue.concat("Nova String"));
        System.out.printf("split: %s\n", Arrays.toString(stringValue.split("e")));
        System.out.printf("strip: %s\n", stringValue.strip());
        System.out.printf("indent: %s\n", stringValue.indent(5));
        System.out.printf("translateEscapes: %s\n", stringValue.translateEscapes());
        System.out.printf("intern: %s\n", stringValue.intern());
        System.out.printf("isBlank: %s\n", stringValue.isBlank());
        System.out.printf("lines: %s\n", stringValue.lines());
        System.out.printf("codePoints: %s\n", stringValue.codePoints());
        System.out.printf("getBytes: %s\n", stringValue.getBytes());
        System.out.printf("matches: %s\n", stringValue.matches("Um regex aqui"));
        System.out.printf("repeat: %s\n", stringValue.repeat(3));

        System.out.println("Alguns métodos para trabalhar com Arrays:");
        System.out.printf("add: %s\n", arrayList.add("Item"));
        System.out.printf("get: %s\n", arrayList.get(0));
        System.out.printf("remove: %s\n", arrayList.remove("Item"));
        System.out.printf("size: %s\n", arrayList.size());
        System.out.printf("contains: %s\n", arrayList.contains("Item"));
        System.out.printf("indexOf: %s\n", arrayList.indexOf("Item"));
        System.out.printf("lastIndexOf: %s\n", arrayList.lastIndexOf("Item"));
        System.out.printf("addAll: %s\n", arrayList.addAll(Arrays.asList("UM", "DOIS")));
        System.out.printf("subList: %s\n", arrayList.subList(0, 1));
        System.out.printf("removeAll: %s\n", arrayList.removeAll(Arrays.asList("UM", "DOIS")));
        System.out.printf("retainAll: %s\n", arrayList.retainAll(Arrays.asList("UM", "DOIS")));
        arrayList.sort((a, b) -> { return -1 * a.compareTo(b);});
        arrayList.clear();

        System.out.println("Alguns métodos para trabalhar com Sets:");
        System.out.printf("add: %s\n", hashSet.add(1));
        System.out.printf("contains: %s\n", hashSet.contains(1));
        System.out.printf("remove: %s\n", hashSet.remove(1));
        System.out.printf("size: %s\n", hashSet.size());
        System.out.printf("isEmpty: %s\n", hashSet.isEmpty());
        hashSet.clear();

        System.out.println("Alguns métodos para trabalhar com Maps:");
        System.out.printf("put: %s\n", hashMap.put("key", "value"));
        System.out.printf("get: %s\n", hashMap.get("key"));
        System.out.printf("remove: %s\n", hashMap.remove("key"));
        System.out.printf("containsKey: %s\n", hashMap.containsKey("key"));
        System.out.printf("containsValue: %s\n", hashMap.containsValue("value"));
        System.out.printf("size: %s\n", hashMap.size());
        System.out.printf("add: %s\n", hashMap.keySet());
        System.out.printf("add: %s\n", hashMap.values());
        System.out.printf("add: %s\n", hashMap.entrySet());

        System.out.println("Alguns outros métodos para trabalhar com Streams:");
        System.out.printf("filter: %s\n", arrayList.stream().filter((item) -> item.length() > 3).collect(Collectors.toList()));
        System.out.printf("map: %s\n", arrayList.stream().map(String::toUpperCase).collect(Collectors.toList()));
        System.out.printf("reduce: %s\n", arrayList.stream().reduce("", (prev, next) -> prev + next));
        System.out.printf("sorted: %s\n", arrayList.stream().sorted());
        System.out.printf("distinct: %s\n", arrayList.stream().distinct());
        System.out.printf("limit: %s\n", arrayList.stream().limit(3));
        System.out.printf("skip: %s\n", arrayList.stream().skip(2));
        System.out.printf("allMatch: %s\n", arrayList.stream().allMatch((item) -> item.length() == 3));
        System.out.printf("collect: %s\n", arrayList.stream().collect(Collectors.toSet()));
        System.out.printf("findAny: %s\n", arrayList.stream().findAny());
    }
}