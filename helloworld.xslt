<xsl:stylesheet version="2.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:output doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN"
                doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"
                encoding="UTF-8"/>

    <xsl:template match="root">
        <html>
            <head>
                <link rel="stylesheet" href="style.css"/>
            </head>
            <body>
                <div>
                    <div class="blek"></div>
                    <div class="kuvblek">
                        <table>
                            <tbody>
                                <xsl:for-each select="friend">
                                    <tr>
                                        <td><xsl:value-of select="name"/></td>
                                        <td><xsl:value-of select="phNo"/></td>
                                    </tr>
                                </xsl:for-each>
                            </tbody>
                        </table>
                    </div>
                    <div class="tola">

                    </div>
                </div>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>