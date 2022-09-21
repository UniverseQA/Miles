public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println("При цене билета в " + price + " ₽");
        System.out.println("Вы получаете " + miles + " бонусных миль на карту");
    }
}