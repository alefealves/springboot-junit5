package alefe.alves.loans.controllers.dto;

import alefe.alves.loans.domain.LoanType;

public record LoanResponse(
        LoanType type,
        Double interestRate
) {
}
