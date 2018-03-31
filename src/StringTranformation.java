package com.naren.test;

public class StringTranformation {

	public static void main(String[] args) {

		String s = "BABABA";
		System.out.println(solution(s));

	}

	public static String solution(String S) {

		if (S == null || S.isEmpty()) {
			return "";
		}

		if (S.contains("AA") || S.contains("BB") || S.contains("CC")) {

			if (S.contains("AA")) {

				S = S.replace("AA", "");
				return solution(S);

			} else if (S.contains("BB")) {

				S = S.replace("BB", "");
				return solution(S);

			} else if (S.contains("CC")) {

				S = S.replace("CC", "");
				return solution(S);

			} else {
				return S;
			}
		} else {
			return S;
		}
	}
}
