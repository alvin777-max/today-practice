package com.ohgiraffers.section02.model.dto;

public class MenuDTO {

    private int menuCode;
    private String menuName;
    private int menuprice;
    private int categoryCode;
    private String orderalbleStatus;

    public MenuDTO(String menuName, int menuprice, int categoryCode, String orderalbleStatus) {
        this.menuName = menuName;
        this.menuprice = menuprice;
        this.categoryCode = categoryCode;
        this.orderalbleStatus = orderalbleStatus;
    }

    public int getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(int menuCode) {
        this.menuCode = menuCode;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public int getMenuPrice() {
        return menuprice;
    }

    public void setMenuPrice(int menuprice) {
        this.menuprice = menuprice;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getOrderableStatus() {
        return orderalbleStatus;
    }

    public void setOrderalbleStatus(String orderalbleStatus) {
        this.orderalbleStatus = orderalbleStatus;
    }

    @Override
    public String toString() {
        return "MenuDTO{" +
                "menuCode=" + menuCode +
                ", menuName='" + menuName + '\'' +
                ", menuprice=" + menuprice +
                ", categoryCode=" + categoryCode +
                ", orderalbleStatus='" + orderalbleStatus + '\'' +
                '}';
    }
}
