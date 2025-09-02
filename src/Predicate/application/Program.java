package Predicate.application;

import Predicate.entities.Product;
import Predicate.utils.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.90));

        // A maioria das formas de usar o predicate, a expressão lambda inline java 8+ é a mais usada

        // ou pode ser passado a classe que está implementando o predicate e a lógica da remoção
        // dos itens, você pode ver o ProductPredicate na pasta utils
        list.removeIf(new ProductPredicate());

        // Usando o metodo reference statico, no caso tenho que informar qual a classe no paramentro,
        // ele é feito dentro da entidade por um metodo,
        // você consegue ver esse metodo acessando a entidade product
        list.removeIf(Product::staticProductPredicate);

        // Usando o metodo reference não statico,
        // ele é feito dentro da entidade por um metodo,
        // você consegue ver esse metodo acessando a entidade product
        list.removeIf(Product::nonStaticProductPredicate);

        // Usando expressão lambda declarada, faço a expressão lambda e passo no removeif da lista
        // bom para usar uma variavel parametrizada
        Predicate<Product> pred = p -> p.getPrice() >= 100;
        list.removeIf(pred);

        // Usando a expressão lambda in line
        // expressão lambda para remover itens acima de 100 reais, usando predicate
        list.removeIf(p -> p.getPrice() >= 100);

        for(Product p : list){
            System.out.println(p);
        }
    }

}
