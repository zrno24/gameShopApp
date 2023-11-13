package com.game.gameshopapp.rest.dto;

import com.game.gameshopapp.core.model.Game;
import com.game.gameshopapp.core.model.User;
import com.game.gameshopapp.core.model.enums.UserType;

import java.util.*;

public class UserDTO implements List<UserDTO> {

    private int id;
    private String name;
    private String username;
    private UserType userType;
    private String password;
    private String email;
    private Date creationDate;



    public UserDTO(User user) {
        this.id = user.getId();
        this.name = user.getFirstName() + user.getLastName();
        this.username = user.getUserName();
        this.userType = user.getUserType();
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.creationDate = user.getCreationDate();

    }


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<UserDTO> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(UserDTO userDTO) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends UserDTO> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends UserDTO> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public UserDTO get(int index) {
        return null;
    }

    @Override
    public UserDTO set(int index, UserDTO element) {
        return null;
    }

    @Override
    public void add(int index, UserDTO element) {

    }

    @Override
    public UserDTO remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<UserDTO> listIterator() {
        return null;
    }

    @Override
    public ListIterator<UserDTO> listIterator(int index) {
        return null;
    }

    @Override
    public List<UserDTO> subList(int fromIndex, int toIndex) {
        return null;
    }
}
