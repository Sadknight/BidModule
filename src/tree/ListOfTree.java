package tree;

import java.io.Serializable;
import java.util.List;

/**
 * Created by DMalenkov on 21.10.2014.
 */
public class ListOfTree implements Serializable, Comparable<ListOfTree> {

    Integer numbGroup;
    private String nameClass;
    private Integer numbClass = -1;
    private Object typeList;
    private List<Object> childrenClass;
    private List<Object> childrenClass2;
    private String pageForList;
    private int groupList;
    private String color;

    public ListOfTree(Integer numbClass, String nameClass, Object typeList, String pageForList, int groupList, String color) {
        this.nameClass = nameClass;
        this.color = color;
        this.typeList = typeList;
        this.pageForList = pageForList;
        this.groupList = groupList;
        this.numbClass = numbClass;
    }

    public ListOfTree(Integer numbClass, Integer numbGroup, String nameClass, Object typeList, String pageForList, int groupList, String color) {
        this.nameClass = nameClass;
        this.color = color;
        this.numbClass = numbClass;
        this.typeList = typeList;
        this.pageForList = pageForList;
        this.groupList = groupList;
        this.numbGroup = numbGroup;
    }


    public ListOfTree(String nameClass, String color) {
        this.nameClass = nameClass;
        this.color = color;
    }

    public ListOfTree(String nameClass, Object typeList, String pageForList, int groupList, String color) {
        this.nameClass = nameClass;
        this.typeList = typeList;
        this.pageForList = pageForList;
        this.groupList = groupList;
        this.color = color;
    }

    public ListOfTree(String nameClass, List<Object> childrenClass, String pageForList, int groupList, String color) {
        this.nameClass = nameClass;
        this.childrenClass = childrenClass;
        this.pageForList = pageForList;
        this.groupList = groupList;
        this.color = color;
    }

    public ListOfTree(String nameClass, int groupList, String color) {
        this.nameClass = nameClass;
        this.groupList = groupList;
        this.color = color;
    }

    public ListOfTree(String nameClass, Object typeList, List<Object> childrenClass, String pageForList, int groupList, String color) {
        this.nameClass = nameClass;
        this.typeList = typeList;
        this.childrenClass = childrenClass;
        this.pageForList = pageForList;
        this.groupList = groupList;
        this.color = color;
    }

    public ListOfTree(String nameClass, Object typeList, List<Object> childrenClass, List<Object> childrenClass2, String pageForList, int groupList, String color) {
        this.nameClass = nameClass;
        this.typeList = typeList;
        this.childrenClass = childrenClass;
        this.pageForList = pageForList;
        this.childrenClass2 = childrenClass2;
        this.groupList = groupList;
        this.color = color;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public int getNumbClass() {
        return numbClass;
    }

    public void setNumbClass(int numbClass) {
        this.numbClass = numbClass;
    }

    public void setNumbClass(Integer numbClass) {
        this.numbClass = numbClass;
    }

    @Override
    public int compareTo(ListOfTree o) {
        return 0;
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nameClass == null) ? 0 : nameClass.hashCode());
        result = prime * result + ((numbClass == null) ? 0 : numbClass.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ListOfTree other = (ListOfTree) obj;
        if (nameClass == null) {
            if (other.nameClass != null)
                return false;
        } else if (!nameClass.equals(other.nameClass))
            return false;

        if (numbClass == null) {
            if (other.numbClass != null)
                return false;
        } else if (!numbClass.equals(other.numbClass))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return nameClass;
    }

    public Object getTypeList() {
        return typeList;
    }

    public void setTypeList(Object typeList) {
        this.typeList = typeList;
    }

    public List<Object> getChildrenClass() {
        return childrenClass;
    }

    public void setChildrenClass(List<Object> childrenClass) {
        this.childrenClass = childrenClass;
    }

    public String getPageForList() {
        return pageForList;
    }

    public void setPageForList(String pageForList) {
        this.pageForList = pageForList;
    }

    public int getGroupList() {
        return groupList;
    }

    public void setGroupList(int groupList) {
        this.groupList = groupList;
    }

    public List<Object> getChildrenClass2() {
        return childrenClass2;
    }

    public void setChildrenClass2(List<Object> childrenClass2) {
        this.childrenClass2 = childrenClass2;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getNumbGroup() {
        return numbGroup;
    }

    public void setNumbGroup(Integer numbGroup) {
        this.numbGroup = numbGroup;
    }
}
