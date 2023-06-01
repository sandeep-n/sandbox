// Generated from Chatlang.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ChatlangParser}.
 */
public interface ChatlangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ChatlangParser#chat}.
	 * @param ctx the parse tree
	 */
	void enterChat(ChatlangParser.ChatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatlangParser#chat}.
	 * @param ctx the parse tree
	 */
	void exitChat(ChatlangParser.ChatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatlangParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(ChatlangParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatlangParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(ChatlangParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatlangParser#message}.
	 * @param ctx the parse tree
	 */
	void enterMessage(ChatlangParser.MessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatlangParser#message}.
	 * @param ctx the parse tree
	 */
	void exitMessage(ChatlangParser.MessageContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatlangParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(ChatlangParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatlangParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(ChatlangParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatlangParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(ChatlangParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatlangParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(ChatlangParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatlangParser#emoticon}.
	 * @param ctx the parse tree
	 */
	void enterEmoticon(ChatlangParser.EmoticonContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatlangParser#emoticon}.
	 * @param ctx the parse tree
	 */
	void exitEmoticon(ChatlangParser.EmoticonContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatlangParser#link}.
	 * @param ctx the parse tree
	 */
	void enterLink(ChatlangParser.LinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatlangParser#link}.
	 * @param ctx the parse tree
	 */
	void exitLink(ChatlangParser.LinkContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatlangParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(ChatlangParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatlangParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(ChatlangParser.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ChatlangParser#mention}.
	 * @param ctx the parse tree
	 */
	void enterMention(ChatlangParser.MentionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ChatlangParser#mention}.
	 * @param ctx the parse tree
	 */
	void exitMention(ChatlangParser.MentionContext ctx);
}