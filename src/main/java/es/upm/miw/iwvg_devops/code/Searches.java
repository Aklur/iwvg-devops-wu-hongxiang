package es.upm.miw.iwvg_devops.code;

import java.util.Objects;
import java.util.stream.Stream;

//Stream<String> findUserFamilyNameInitialBySomeProperFraction();
//1 Stream<String> findUserIdBySomeProperFraction();
//2 Fraction findFractionMultiplicationByUserFamilyName(String familyName);
//Stream<String> findUserNameBySomeImproperFraction();
public class Searches {
    public Stream<String> findUserFamilyNameByUserNameDistinct(String userName) {
    return new UsersDatabase().findAll()
            .filter(user -> userName.equals(user.getName()))
            .map(User::getFamilyName)
            .distinct();
    }

    public Stream<Integer> findFractionNumeratorByUserFamilyName(String userFamilyName) {
        return new UsersDatabase().findAll()
                .filter(user -> userFamilyName.equals(user.getFamilyName()))
                .flatMap(user -> user.getFractions().stream()
                        .filter(Objects::nonNull)
                )
                .map(Fraction::getNumerator);
    }

    public Stream<String> findUserFamilyNameByFractionDenominator(int fractionDenominator) {
        return new UsersDatabase().findAll()
                .filter(user -> user.getFractions().stream()
                        .anyMatch(fraction -> fractionDenominator == fraction.getDenominator()))
                .map(User::getFamilyName);
    }

    public Stream<String> findUserFamilyNameInitialByAnyProperFraction() {
        return new UsersDatabase().findAll()
                .filter(user -> user.getFractions().stream()
                        .anyMatch(fraction -> fraction.isProper()))
                .map(User::initialsFamilyName);
    }


    public Stream<String> findUserNameByAnyImproperFraction() {
        return Stream.empty();
    }


}
