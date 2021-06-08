package study.ascii92der.lotto.step3to5;

public class ResultView implements LottoOutput {

    public static final String PRINT_BUY_LOTTO_COUNT = "수동으로 %d장, 자동으로 %d개를 구매했습니다.%n";
    public static final String PRINT_WINNER_RESULT = "%d개 일치 (%d원)- %d개%n";
    public static final String PRINT_WINNER_RESULT_WITH_BONUS = "%d개 일치, 보너스 볼 일치(%d원)- %d개%n";
    public static final String PRINT_RESULT_SEPARATOR = "---------";
    public static final String PRINT_RESULT = "당첨 통계";
    public static final String PRINT_TOTAL_EARNING_RATE = "총 수익률은 %.2f입니다.%n";

    @Override
    public void printLottoCount(LottoPrice manualLottoPrice, LottoPrice balanceLottoPrice) {
        System.out.printf(PRINT_BUY_LOTTO_COUNT, manualLottoPrice.lottoCount(), balanceLottoPrice.lottoCount());
    }

    @Override
    public void printLottoNumbers(Lottos lottos) {
        System.out.print(lottos.toString());
    }

    @Override
    public void printWinnerResult(WinResult winResult) {
        System.out.println(PRINT_RESULT);
        System.out.println(PRINT_RESULT_SEPARATOR);
        System.out.printf((PRINT_WINNER_RESULT),
                LottoWinner.FIFTH.getMatchNumberCount(),
                LottoWinner.FIFTH.getWinnerPrice(),
                winResult.result(LottoWinner.FIFTH));
        System.out.printf((PRINT_WINNER_RESULT),
                LottoWinner.FOURTH.getMatchNumberCount(),
                LottoWinner.FOURTH.getWinnerPrice(),
                winResult.result(LottoWinner.FOURTH));
        System.out.printf((PRINT_WINNER_RESULT),
                LottoWinner.THIRD.getMatchNumberCount(),
                LottoWinner.THIRD.getWinnerPrice(),
                winResult.result(LottoWinner.THIRD));
        System.out.printf((PRINT_WINNER_RESULT_WITH_BONUS),
                LottoWinner.SECOND.getMatchNumberCount(),
                LottoWinner.SECOND.getWinnerPrice(),
                winResult.result(LottoWinner.SECOND));
        System.out.printf((PRINT_WINNER_RESULT),
                LottoWinner.FIRST.getMatchNumberCount(),
                LottoWinner.FIRST.getWinnerPrice(),
                winResult.result(LottoWinner.FIRST));
        System.out.printf((PRINT_TOTAL_EARNING_RATE), winResult.totalEarningRate());
        System.out.println();
    }
}
