package framework;

public abstract class ItemCreator {

    // 팩토리 메서드 페턴에서 템플릿 메서드 패턴을 사용
    public Item create() {
        
        Item item;

        requestItemsInfo();
        item = createItem();
        createItemLog();
        
        return item;
        
    }

    // 아이템 생성 전 데이터 베이스에서 아이템 정보 요청
    abstract protected void requestItemsInfo();

    // 아이템 생성 후 데이터 베이스에 아이템 생성 정보 입력
    abstract protected void createItemLog();

    // 아이템 생성 알고리즘
    abstract protected Item createItem();
    
}