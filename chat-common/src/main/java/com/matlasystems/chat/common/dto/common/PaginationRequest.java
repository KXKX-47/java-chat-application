/*
Encapsulates pagination and sorting parameters sent by the client
*/



package com.matlasystems.chat.common.dto.common;

public class PaginationRequest {

    private int page;

    private int size;

    private String sortBy;

    private String sortDirection;

    public PaginationRequest() {
        this.page = 0;
        this.size = 20;
        this.sortBy = "id";
        this.sortDirection = "ASC";
    }

    public PaginationRequest(int page,
                             int size,
                             String sortBy,
                             String sortDirection) {

        this.page = page;
        this.size = size;
        this.sortBy = sortBy;
        this.sortDirection = sortDirection;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public String getSortDirection() {
        return sortDirection;
    }

    public void setSortDirection(String sortDirection) {
        this.sortDirection = sortDirection;
    }

}