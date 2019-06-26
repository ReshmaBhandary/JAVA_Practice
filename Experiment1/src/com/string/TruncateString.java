package com.string;

import java.text.SimpleDateFormat;

public class TruncateString {
	private static final String FILE_NAME_NEW_DATE_FORMAT = "yyyyMMdd";
	private static final String CONSENT_DETAILS_FILE_FORMAT = "MHR_ConsentDetails";
	private static final String DOT = ".";
	private static final String UNDERSCORE = "_";
	private static final String ONLY_NUMBER_PATTERN = "^[0-9]*$";
	private static final String INPUT_FILE_FORMAT_ERROR = "The file name format is incorrect.";

	public static void main(String[] args) {
		String fileName = "MHR_ConsentDetails_20190118_1234";
		fileNameFormatForConsentDetailsForMyself("MHR_ConsentDetails_20190118_1234");
	//	fileNameFormatForConsentDetails("MHR_ConsentDetails_20190118_1234");
		// System.out.println("_20190118_1234".length());
		String userName = "r.bhandary";
		// System.out.println(fileName);
		// System.out.println(finalNameFile(fileName, userName));

	}

	private static void fileNameFormatForConsentDetailsForMyself(String fileName) {
		String[] fileNameArray = fileName.split("_");
		if (!(fileNameArray.length == 4 && fileNameArray[0].equals("MHR")&& fileNameArray[1].equals("ConsentDetails")&& fileNameArray[2].length()==8) ){
		
			System.out.println("not in format");
		}
		
		
	}

	static void fileNameFormatForConsentDetails(String fileName) {
		String fileFormatStatus = "";
		char underscore_char = '_';
		boolean consentDetailsFileNameFormatFlag = true;
		SimpleDateFormat f = new SimpleDateFormat(FILE_NAME_NEW_DATE_FORMAT);
		int fileNameWithoutFileNumber = fileName.lastIndexOf(UNDERSCORE);
		if (fileNameWithoutFileNumber < 18) {
			consentDetailsFileNameFormatFlag = false;
			fileFormatStatus = INPUT_FILE_FORMAT_ERROR;

		} else {
			System.out.println("fileNameWithoutFileNumber  " + fileNameWithoutFileNumber);
			System.out.println("fileName sub string from fileNameWithoutFileNumber   "
					+ fileName.substring(0, fileNameWithoutFileNumber));// MHR_Bulk_Cancellation_20180910

			int fileNamewithoutFileNumberAndDate = fileName.lastIndexOf(UNDERSCORE) - 9;
			System.out.println(fileName.substring(0, fileNamewithoutFileNumberAndDate));// MHR_Bulk_Cancellation
			System.out.println(fileName.charAt(fileNamewithoutFileNumberAndDate));// _

			if (underscore_char != fileName.charAt(fileNamewithoutFileNumberAndDate)) {
				consentDetailsFileNameFormatFlag = false;
			}
			int indexOfDot = fileName.lastIndexOf(DOT);
			System.out.println(indexOfDot);// -1
			System.out.println(fileNameWithoutFileNumber);// 30

			if (fileNameWithoutFileNumber == -1 || indexOfDot == -1) {
				consentDetailsFileNameFormatFlag = false;
			}
			// startformat check
			if (fileNamewithoutFileNumberAndDate != -1) {
				String startformat = fileName.substring(0, fileNamewithoutFileNumberAndDate);
				System.out.println("startformat " + startformat);
				if (!startformat.equals(CONSENT_DETAILS_FILE_FORMAT)) {// checks for MHR_Bulk_Cancellation
					consentDetailsFileNameFormatFlag = false;
				}
			}
			if (fileNameWithoutFileNumber != -1) {
				String dateFromatCheckString = fileName.substring(fileNamewithoutFileNumberAndDate + 1,
						fileNameWithoutFileNumber);
				f.setLenient(false);
				if (!(dateFromatCheckString != null && dateFromatCheckString.matches(ONLY_NUMBER_PATTERN))) {
					consentDetailsFileNameFormatFlag = false;
				} else if (fileNameWithoutFileNumber != -1 && indexOfDot != -1) {
					String fileNumberFormatCheckString = fileName.substring(fileNameWithoutFileNumber + 1, indexOfDot);
					if (!(fileNumberFormatCheckString.matches(ONLY_NUMBER_PATTERN)
							&& (fileNumberFormatCheckString.length() == 4))) {
						consentDetailsFileNameFormatFlag = false;
					}
				} else {
					try {
						f.parse(dateFromatCheckString);
					} catch (Exception e) {
						consentDetailsFileNameFormatFlag = false;
					}
				}

			}

		}
		if (consentDetailsFileNameFormatFlag == false) {
			fileFormatStatus = INPUT_FILE_FORMAT_ERROR;
		} else {
			fileFormatStatus = null;
		}
		System.out.println("fileFormatStatus ************" + fileFormatStatus);

	}

	static String finalNameFile(String fileName, String userName) {
		int lastIndex = fileName.lastIndexOf("_");
		String fileNumber = fileName.substring(lastIndex);// MHR_ConsentDetails_20190118
		String stringWithoutFilenumer = fileName.substring(0, lastIndex);
		String constantString = stringWithoutFilenumer.substring(0, stringWithoutFilenumer.lastIndexOf("_"));
		StringBuilder str = new StringBuilder();
		String date = stringWithoutFilenumer.substring(stringWithoutFilenumer.lastIndexOf("_"));
		str.append(constantString).append("_").append(userName).append("_B").append(date).append("_C")
				.append(fileNumber);
		return str.toString();

	}

}
