package study.ascii92der.lotto.step3to5;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputView implements LottoInput {
    public static final String INPUT_MONEY = "구입금액을 입력해 주세요.";
    public static final String INPUT_MANUAL_LOTTO_COUNT = "수동으로 구매할 로또 수를 입력해 주세요.";
    public static final String INPUT_MANUAL_LOTTO_NUMBERS = "수동으로 구매할 번호를 입력해 주세요.";
    public static final String INPUT_WINNER_NUMBERS = "지난 주 당첨 번호를 입력해 주세요.";
    public static final String INPUT_BONUS_NUMBER = "보너스 볼을 입력해 주세요.";
    public static final String LOTTO_NUMBER_SEPARATOR = ",";

    private final Scanner scanner;

    public InputView(InputStream inputStream) {
        scanner = new Scanner(inputStream);
    }

    @Override
    public LottoPrice inputMoney() {
        System.out.println(INPUT_MONEY);
        return new LottoPrice(Integer.parseInt(scanner.nextLine()));
    }

    @Override
    public LottoPrice inputManualLottoCount() {
        System.out.println(INPUT_MANUAL_LOTTO_COUNT);
        return new LottoPrice(Integer.parseInt(scanner.nextLine()) * LottoPrice.LOTTO_PRICE);
    }

    @Override
    public Lottos inputManualLottos(LottoPrice manualLottoPrice) {
        System.out.println(INPUT_MANUAL_LOTTO_NUMBERS);

        List<Lotto> lottosList = new ArrayList<>();
        while (lottosList.size() < manualLottoPrice.lottoCount()) {
            lottosList.add(inputManualLotto());
        }
        return new Lottos(lottosList);
    }

    private Lotto inputManualLotto() {
        List<Integer> lottoNumbers =
                Arrays.stream(
                        scanner.nextLine().split(LOTTO_NUMBER_SEPARATOR))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
        return new Lotto(lottoNumbers);
    }

    @Override
    public Lotto inputWinnerNumbers() {
        System.out.println(INPUT_WINNER_NUMBERS);
        List<Integer> winingNumbers =
                Arrays.stream(
                        scanner.nextLine().split(LOTTO_NUMBER_SEPARATOR))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        return new Lotto(winingNumbers);
    }

    @Override
    public LottoNumber inputBonusNumber() {
        System.out.println(INPUT_BONUS_NUMBER);
        return new LottoNumber(Integer.parseInt(scanner.nextLine()));
    }

}
