package javaLanguage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.common.base.Joiner;

public class JavaRegex {

	public static void main(String[] args) {
		// using pattern with flags
		Pattern pattern = Pattern.compile("ab", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("ABcabdAb");
		// using Matcher find(), group(), start() and end() methods
		while (matcher.find()) {
			System.out.println("Found the text \"" + matcher.group()
					+ "\" starting at " + matcher.start()
					+ " index and ending at index " + matcher.end());
		}

		// using Pattern split() method
		pattern = Pattern.compile("\\W");
		String[] words = pattern.split("one@two#three:four$five");
		for (String s : words) {
			System.out.println("Split using Pattern.split(): " + s);
		}

		// using Matcher.replaceFirst() and replaceAll() methods
		pattern = Pattern.compile("1*2");
		matcher = pattern.matcher("11234512678");
		System.out.println("Using replaceAll: " + matcher.replaceAll("_"));
		System.out.println("Using replaceFirst: " + matcher.replaceFirst("_"));

		// regex for log
		String regexAMIID = "(?i)(?:\\bami-[0-9a-fA-F]{8}\\b)";
		String regexEC2InstanceID = "(?i)(?:\\bi-[0-9a-fA-F]{8}\\b)";
		String regexIP = "(?i)(?:\\d{1,3}(?:\\.\\d{1,3}){3})|(?:[a-f0-9]{1,4}(?::[a-f0-9]{1,4}){7})";
		String regexJavaPackage = "(?:\\b(?:\\$|_|[a-z])(?:\\w|\\$|_)*(?:\\.(?:\\$|_|[a-z])(?:\\w|\\$|_)*)*\\b)";

		// URL
		String NON_STD_CHARS = "(?:=)";
		String ALPHA = "(?:[a-zA-Z])";
		String SAFE = "(?:\\$|-|_|@|\\.|&|\\+)";
		String EXTRA = "(?:!|\\*|\"|'|\\(|\\)|,)";
		String ESCAPE = "(?:%[a-fA-F0-9]{2})";
		String X_ALPHA = "(?:" + ALPHA + "|\\d|" + SAFE + "|" + EXTRA + "|"
				+ ESCAPE + ")";
		String I_ALPHA = "(?:" + ALPHA + X_ALPHA + "+)";
		String XP_ALPHA = "(?:" + X_ALPHA + "|\\+)";
		String HOST_NAME = "(?:" + I_ALPHA + "(?:\\." + I_ALPHA + ")*)";
		String HOST_NUMBER = "(?:\\d+(?:\\.\\d+){3})";
		String HOST = "(?:" + HOST_NAME + "|" + HOST_NUMBER + ")";
		String PORT = "(?:\\d+)";
		String HOST_PORT = "(?:" + HOST + "(?::" + PORT + ")?)";
		String SEGMENT = "(?:" + XP_ALPHA + "+)";
		String PATH = "(?:" + SEGMENT + "(?:/" + SEGMENT + ")*/?)";
		String SEARCH = "(?:(?:" + XP_ALPHA + "|" + NON_STD_CHARS + ")*)";
		String HTTP_ADDRESS = "(?:https?://" + HOST_PORT + "(?:/" + PATH
				+ "?)?" + "(?:\\?" + SEARCH + ")?)";
		String regexURL = "(?i)" + HTTP_ADDRESS;

		// Timestamp
		int FIRST_DATE_ELEMENT_GROUP_INDEX = 1;
		String YEAR_REGEX = "(\\d{4})";
		String MONTH_REGEX;
		String DAY_REGEX = "(0?[1-9]|[12]\\d|3[01])";
		String TIME_REGEX = "(?<hour>\\d{1,2})\\s*:\\s*(?<minute>\\d{1,2})"
				+ "(?:\\s*:\\s*(?<second>\\d{1,2})(?:\\s*[.,]\\s*(?<ms>\\d{1,3}))?)?"
				+ "(?:\\s*(?<tz>z|(?:(?:\\+|-)\\d{2}:\\d{2})))?";
		String[] DATE_ELEMENT_SEPARATORS = { "\\s+", "\\s*\\.\\s*",
				"\\s*-\\s*", "\\s*\\/\\s*" };
		Map<String, Integer> monthNameValueMap;
		List<Integer[]> dateElementIndexOrders;
		String[] monthNames = { "january", "february", "march", "april", "may",
				"june", "july", "august", "september", "october", "november",
				"december", "jan", "feb", "mar", "apr", "may", "jun", "jul",
				"aug", "sep", "oct", "nov", "dec" };
		StringBuilder monthRegexBuilder = new StringBuilder("(");
		Joiner.on('|').appendTo(monthRegexBuilder, monthNames);
		monthRegexBuilder.append("|0?[1-9]|1[0-2])");
		MONTH_REGEX = monthRegexBuilder.toString();
		monthNameValueMap = new HashMap<String, Integer>(24);
		for (int i = 0; i < monthNames.length; ++i) {
			monthNameValueMap.put(monthNames[i], i % 12);
		}
		String[] dateElements = new String[] { YEAR_REGEX, MONTH_REGEX,
				DAY_REGEX };
		dateElementIndexOrders = new ArrayList<Integer[]>(3);
		dateElementIndexOrders.add(new Integer[] { 0, 1, 2 });
		dateElementIndexOrders.add(new Integer[] { 1, 2, 0 });
		dateElementIndexOrders.add(new Integer[] { 2, 1, 0 });
		StringBuilder regexBuilder = new StringBuilder("(?i)");
		regexBuilder.append("(?:");
		StringBuilder[] dateBuffers = new StringBuilder[DATE_ELEMENT_SEPARATORS.length
				* dateElementIndexOrders.size()];
		int dateBufferIndex = 0;
		for (String dateElementSeparator : DATE_ELEMENT_SEPARATORS) {
			for (Integer[] dateElementIndexOrder : dateElementIndexOrders) {
				dateBuffers[dateBufferIndex] = new StringBuilder("(?:");
				Joiner.on(dateElementSeparator).appendTo(
						dateBuffers[dateBufferIndex],
						dateElements[dateElementIndexOrder[0]],
						dateElements[dateElementIndexOrder[1]],
						dateElements[dateElementIndexOrder[2]]);
				dateBuffers[dateBufferIndex].append(")");
				++dateBufferIndex;
			}
		}
		Joiner.on('|').appendTo(regexBuilder, dateBuffers);
		regexBuilder.append(")");
		String regexTimestamp = regexBuilder.append("(?:\\s*(?:[t_]|\\s)\\s*)")
				.append(TIME_REGEX).toString();
		
		// match

		/*
		 * IP
		String logLine1 = "{Client: localhost 127.0.0.1} Started.";
		String logLine2 = "{Client: localhost IPTOKEN} Started.";
		String logLine3 = "127.0.0.1";
		
		String regex1 = "127\\.0\\.0\\.1";
		String regex2 = "((?i)(?:\\\\d{1,3}(?:\\\\.\\\\d{1,3}){3})|(?:[a-f0-9]{1,4}(?::[a-f0-9]{1,4}){7}))";
		
		String regex3 = "^\\s*\\{Client:\\s+localhost\\s+127\\.0\\.0\\.1\\}\\s+Started\\.\\s*$";
		String regex4 = "^\\s*\\{Client:\\s+localhost\\s+IPTOKEN\\}\\s+Started\\.\\s*$";
		String regex5 = "^\\s*\\{Client:\\s+localhost\\s+((?i)(?:\\d{1,3}(?:\\.\\d{1,3}){3})|(?:[a-f0-9]{1,4}(?::[a-f0-9]{1,4}){7}))\\}\\s+Started\\.\\s*$";
		
		String regex6 = regex4.replaceAll("IPTOKEN", regex2);
		
		System.out.println(regex5);
		System.out.println(regex6);
		*/
		
		
		/* AMIID
		String logLine1 = "ami-a105959b";
		String logLine2 = "Task:Pushing ami-a105959b into.";
		String logLine3 = "Task:Pushing AMIIDTOKEN into.";
		
		String regex1 = "((?i)(?:\\\\bami-[0-9a-fA-F]{8}\\\\b))";
		String regex2 = "^\\s*Task:Pushing\\s+AMIIDTOKEN\\s+into\\.\\s*$";
		String regex3 = "^\\s*Task:Pushing\\s+((?i)(?:\\bami-[0-9a-fA-F]{8}\\b))\\s+into\\.\\s*$";
		String regex4 = regex2.replaceAll("AMIIDTOKEN", regex1);
		
		System.out.println(regex3);
		System.out.println(regex4);
		*/
		
		// [] must be a blank
		
		/*
		 * EC2INSTANCEID
		String logLine1 = "i-3fb96c03";
		String logLine2 = "Terminate 1 instance [i-3fb96c03] .";
		String logLine3 = "Terminate 1 instance [EC2INSTANCEIDTOKEN] .";
		String regex1 = "((?i)(?:\\\\bi-[0-9a-fA-F]{8}\\\\b))";
		String regex2 = "^\\s*Terminate\\s+1\\s+instance\\s+\\[EC2INSTANCEIDTOKEN\\]\\s+\\.\\s*$";
		String regex3 = "^\\s*Terminate\\s+1\\s+instance\\s+\\[((?i)(?:\\bi-[0-9a-fA-F]{8}\\b))\\]\\s+\\.\\s*$";
		String regex4 = regex2.replaceAll("EC2INSTANCEIDTOKEN", regex1);
		System.out.println(regex3);
		System.out.println(regex4);
		*/
		
		
		//URL
		/*String logLine1 = "2013-07-12 16:18:38,285";
		String logLine2 = "2013-07-12_16:18:38";
		String logLine3 = "[TIMESTAMPTOKEN] com.netflix.asgard.Task.";
		String logLine4 = "[2013-07-12 16:07:32,129] com.netflix.asgard.Task.";
		
		String regex1 = "((\\\\d\\\\d\\\\d\\\\d-\\\\d\\\\d-\\\\d\\\\d\\\\s+\\\\d\\\\d:\\\\d\\\\d:\\\\d\\\\d,\\\\d\\\\d\\\\d)|(\\\\d\\\\d\\\\d\\\\d-\\\\d\\\\d-\\\\d\\\\d_\\\\d\\\\d:\\\\d\\\\d:\\\\d\\\\d))";
		String regex2 = "\\s*\\[TIMESTAMPTOKEN\\]\\s+com\\.netflix\\.asgard\\.Task\\.\\s*$";
		
		String regex3 = "\\s*\\[((\\d\\d\\d\\d-\\d\\d-\\d\\d\\s+\\d\\d:\\d\\d:\\d\\d,\\d\\d\\d)|(\\d\\d\\d\\d-\\d\\d-\\d\\d_\\d\\d:\\d\\d:\\d\\d))\\]\\s+com\\.netflix\\.asgard\\.Task\\.\\s*$";
		
		String regex4 = regex2.replaceAll("TIMESTAMPTOKEN", regex1);*/
		
		String logLine1 = "0:0:0:0:0:0:0:1";
		
		String regex1 = "(?i)(?:\\d{1,3}(?:\\.\\d{1,3}){3})|(?:[a-f0-9]{1,4}(?::[a-f0-9]{1,4}){7})";
		
		Pattern p = Pattern.compile(regex1);

		System.out.println(String.format(p.matcher(logLine1).matches() ? "PASS"
				: "FAIL"));
		
		// replace
		String test = "\\LAMIIDTOKENL";
		pattern = Pattern.compile("AMIIDTOKEN");
		matcher = pattern.matcher(test);
		System.out.println("Using replaceAll: " + matcher.replaceAll(regexAMIID));
		
		String aaa = "\\a";
		System.out.println(aaa);
		
		String str = "abcd=0; efgh=1";
	    String replacedStr = str.replaceAll("abcd", "dddd");

	    System.out.println(str);
	    System.out.println(replacedStr);

	}

}