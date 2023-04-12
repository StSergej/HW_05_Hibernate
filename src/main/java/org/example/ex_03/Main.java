/*  Создайте в цикле 200 объектов author и сохраните в БД.
    Значения полей могут быть любыми. Используйте метод flush для каждых 10 объектов.
    Метод сommit выполняйте один раз в конце.
 */

package org.example.ex_03;

import org.example.ex_03.repositories.AuthorHelper;

public class Main {

    public static void main(String[] args) {

        AuthorHelper authorHelper = new AuthorHelper();

        authorHelper.exampleFlush();



    }

}
