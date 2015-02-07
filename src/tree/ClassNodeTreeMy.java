package tree;

import org.primefaces.model.TreeNode;
import org.primefaces.model.TreeNodeChildren;

import java.util.List;

/**
 * Created by DMalenkov on 23.10.2014.
 */
public class ClassNodeTreeMy implements NodeTreeMy {
    public static final String DEFAULT_TYPE = "default";

    private String type;

    private Object data;

    private List<TreeNode> children;

    private TreeNode parent;

    private boolean expanded;

    private boolean selected;

    private boolean selectable = true;

    private String rowKey;

    public ClassNodeTreeMy() {
        this.type = DEFAULT_TYPE;
        this.children = new TreeNodeChildren(this);
    }

    public ClassNodeTreeMy(Object data) {
        this.type = DEFAULT_TYPE;
        this.children = new TreeNodeChildren(this);
        this.data = data;
    }

    public ClassNodeTreeMy(Object data, TreeNode parent) {
        this.type = DEFAULT_TYPE;
        this.data = data;
        this.children = new TreeNodeChildren(this);
        if (parent != null) {
            parent.getChildren().add(this);
        }
    }

    public ClassNodeTreeMy(String type, Object data, TreeNode parent) {
        this.type = type;
        this.data = data;
        this.children = new TreeNodeChildren(this);
        if (parent != null) {
            parent.getChildren().add(this);
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public List<TreeNode> getChildren() {
        return children;
    }

    public void setChildren(List<TreeNode> children) {
        this.children = children;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }

    public boolean isSelected() {
        return this.selected;
    }

    public void setSelected(boolean value) {
        this.selected = value;
    }

    public boolean isSelectable() {
        return selectable;
    }

    public void setSelectable(boolean selectable) {
        this.selectable = selectable;
    }

    public int getChildCount() {
        return children.size();
    }

    public boolean isLeaf() {
        if (children == null)
            return true;

        return children.isEmpty();
    }

    public String getRowKey() {
        return rowKey;
    }

    public void setRowKey(String rowKey) {
        this.rowKey = rowKey;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((data == null) ? 0 : data.hashCode());
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

        ClassNodeTreeMy other = (ClassNodeTreeMy) obj;
        if (data == null) {
            if (other.data != null)
                return false;
        } else if (!data.equals(other.data))
            return false;

        return true;
    }

    @Override
    public String toString() {
        if (data != null)
            return data.toString();
        else
            return super.toString();
    }

    public boolean isPartialSelected() {
        return false;
    }

    public void setPartialSelected(boolean value) {
        //nothing
    }

}
