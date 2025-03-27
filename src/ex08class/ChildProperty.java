package ex08class;

public class ChildProperty {
	//멤버변수
	private int beads;

	//생성자
	public ChildProperty(int beads) {
		this.beads = beads;
	}
	
	//멤버메소드
	public void showProperty() {
		System.out.println("보유 구슬의 개수:"+ beads);
	}
	
	public void obtainBead(ChildProperty other, int count) {//두 어린이 간의 구슬 주고받기를 구현한 메서드
        if (other.beads < count) {//other =>다른 ()것을 가리키는 객체
            System.out.println("상대방의 구슬이 부족합니다!");
            return;
        }

        this.beads += count;  // 내 구슬 개수 증가
        other.beads -= count; // 상대방 구슬 개수 감소
    }	//this => 현재객체 , other =>메서드를 호출할 때 전달받는 객체
}
