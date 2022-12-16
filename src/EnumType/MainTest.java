package EnumType;

public class MainTest {
    public static void main(String[] args) {
        useConstantanMethod(1);
        useConstantanMethod(2);
        useConstantanMethod(3);
        useConstantanMethod(4);
        useConstantanMethod(100);
        useConstantanMethod(5);
    }

    //Eski tarz
    private static void useConstantanMethod(int i) {
        if (i == TransactionTypeConstant.DEPOSIT) {
            System.out.println("Money is depositing");
        } else if (i == TransactionTypeConstant.WITHDRAW) {
            System.out.println("Money is withdrawing");
        } else if (i == TransactionTypeConstant.TRANSFER) {
            System.out.println("Money is transfering");
        } else if (i == TransactionTypeConstant.PAYMENT) {
            System.out.println("Money is being made");
        } else if (i == TransactionTypeConstant.OTHER) {
            System.out.println("Other Transaction");
        }
    }

    //Enum yapıyla
    private static void useEnumMethod(TransactionType transactionType) {
        if (transactionType == TransactionType.DEPOSIT) {
            System.out.println("Money is depositing");
        } else if (transactionType == TransactionType.PAYMENT) {
            System.out.println("Money is being made");
        } else if (transactionType == TransactionType.WITHDRAW) {
            System.out.println("Money is withdrawing");
        } else if (transactionType == TransactionType.TRANSFER) {
            System.out.println("Money is tranfering");
        } else if (transactionType == TransactionType.OTHER) {
            System.out.println("Other transaction");
        }

        //Note: Enum yapıya has metodlar
        System.out.println("Enum type: "+ transactionType.name() );
        System.out.println("Enum Coder Value: "+ transactionType.getTransactionCode());
        System.out.println("Enum Ordinal: "+ transactionType.ordinal());
    }
}
