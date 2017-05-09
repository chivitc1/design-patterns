package patterns.visitor;

public interface ItemElement {
	public int accept(IShoppingCartVisitor visitor);
}
