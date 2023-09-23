package org.example.app.services;

import java.util.List;

public interface ProjectRepository<T> {

    List<T> retreiveAll();

    void storeBook(T book);

    boolean removeItemById(String bookIdToRemove);

    boolean removeItemByRegex(String regex);
}
