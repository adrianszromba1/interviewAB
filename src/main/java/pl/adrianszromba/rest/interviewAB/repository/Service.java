package pl.adrianszromba.rest.interviewAB.repository;

import java.util.List;

public interface Service<T> {

    List<T> getAll();
}
