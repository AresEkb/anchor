@echo off

for %%f in (*.svg) do (
  echo Found "%%f"
  convert "%%f" "%%~nf.png"
)
