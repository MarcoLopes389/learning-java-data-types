package org.example;

import java.util.*;

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

        while (!queue.isEmpty()) {
            var result = queue.poll();
        }
    }
}